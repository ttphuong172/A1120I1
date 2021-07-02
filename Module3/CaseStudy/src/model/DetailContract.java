package model;

public class DetailContract {
    private int detailContractId;
    private AttachService attachService;
    private Contract contract;
    private int quantity;

    public DetailContract(int detailContractId, AttachService attachService, Contract contract, int quantity) {
        this.detailContractId = detailContractId;
        this.attachService = attachService;
        this.contract = contract;
        this.quantity = quantity;
    }

    public int getDetailContractId() {
        return detailContractId;
    }

    public DetailContract(AttachService attachService, Contract contract, int quantity) {
        this.attachService = attachService;
        this.contract = contract;
        this.quantity = quantity;
    }

    public void setDetailContractId(int detailContractId) {
        this.detailContractId = detailContractId;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
