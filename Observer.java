public abstract class Observer {
    protected Player player;
    public abstract void UpdateBidding() throws Exception;
    public abstract void UpdateFinalDeal() throws Exception;
}