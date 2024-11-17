package use_case.to_sell_view;

/**
 * Input Boundary for going to sell view.
 */
public interface ToSellInputBoundary {
    /**
     * Executes the To Sell use case.
     * @param ToSellInputData the input data
     */
    void execute(ToSellInputData ToSellInputData);
}