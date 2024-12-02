package app;

import javax.swing.JFrame;

/**
 * The Main class of our application.
 */
public class Main {
    /**
     * Builds and runs the CA architecture of the application.
     * @param args unused arguments
     */
    public static void main(final String[] args) {
        final AppBuilder appBuilder = new AppBuilder();
        final JFrame application = appBuilder.addLoginView().addSignupView().addHomeView()
                                            .addSellView().addSearchView().addWishlistView()
                                            .addSignupUseCase().addLoginUseCase().addLogoutUseCase()
                                            .addToSellViewUseCase().addToSearchViewUseCase()
                                            .addToFilterByRatingViewUseCase().addSellUseCase().addSearchUseCase()
                                            .addFilterByRatingUseCase().addBackToHomeUseCase().addViewWishlistUseCase()
                                            .addRemoveFromWishlistUseCase().addAddToWishlistUseCase()
                                            .addBackToSignupUseCase().addChangePasswordUseCase()
                                            .addUpdateListingsUseCase().build();

        application.pack();
        application.setVisible(true);
    }
}
