package use_case.filter_by_rating;

import java.util.List;

import entity.listing.Listing;

/**
 * The Filter By Rating Interactor.
 */
public class FilterByRatingInteractor implements FilterByRatingInputBoundary {
    private final FilterByRatingDataAccessInterface filterByRatingDataAccessObject;
    private final FilterByRatingOutputBoundary filterByRatingPresenter;

    public FilterByRatingInteractor(FilterByRatingDataAccessInterface filterByRatingDataAccessInterface,
                                    FilterByRatingOutputBoundary filterByRatingOutputBoundary) {
        this.filterByRatingDataAccessObject = filterByRatingDataAccessInterface;
        this.filterByRatingPresenter = filterByRatingOutputBoundary;
    }

    @Override
    public void execute(FilterByRatingInputData filterByRatingInputData) {
        // retrieve minimum rating to filter by
        final int minRating = filterByRatingInputData.getRating();

        // retrieve books in database with that rating or higher
        final List<Listing> listings = filterByRatingDataAccessObject.filterByRating(minRating);

        // pass output data to the presenter
        final FilterByRatingOutputData filterByRatingOutputData = new FilterByRatingOutputData(listings);
        this.filterByRatingPresenter.prepareSuccessView(filterByRatingOutputData);
    }

}
