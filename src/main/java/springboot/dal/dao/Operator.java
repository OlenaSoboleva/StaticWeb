package springboot.dal.dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "operator")
public class Operator implements Serializable {
    @Id
    @Column(name = "operator_cd")
    private String operatorCd;
    @Column(name = "operator_desc")
    private String operatorDesc;
    @Column(name = "booking_form")
    private String bookingForm;
    @Column(name = "inactive_date")
    private Date inactiveDate;
    @Column(name = "inactive_ind")
    private String inactiveInd;
    @Column(name = "low_stock_val")
    private Number lowStockVal;
    @Column(name = "perc_thres")
    private Number percThres;
    @Column(name = "bkg_ref_val")
    private String bkgRefVal;
    @Column(name = "tc_cost_code_ind")
    private String tcCostCodeInd;
    @Column(name = "currency_cd")
    private String currencyCd;
    @Column(name = "rescon_invoice_ind")
    private String resconInvoiceInd;

    public Operator() {
    }

    public Operator(String operatorCd, String operatorDesc) {
        this.operatorCd = operatorCd;
        this.operatorDesc = operatorDesc;
    }

    public Operator(String operatorCd, String operatorDesc, String bookingForm, Date inactiveDate, String inactiveInd, Number lowStockVal, Number percThres, String bkgRefVal, String tcCostCodeInd, String currencyCd, String resconInvoiceInd

    ) {
        this.operatorCd = operatorCd;
        this.operatorDesc = operatorDesc;
        this.bookingForm = bookingForm;
        this.inactiveDate = inactiveDate;
        this.inactiveInd = inactiveInd;
        this.lowStockVal = lowStockVal;
        this.percThres = percThres;
        this.bkgRefVal = bkgRefVal;
        this.tcCostCodeInd = tcCostCodeInd;
        this.currencyCd = currencyCd;
        this.resconInvoiceInd = resconInvoiceInd;
    }


    public String getOperatorCd() {
        return operatorCd;
    }

    public String getOperatorDesc() {
        return operatorDesc;
    }

    public String getBookingForm() {
        return bookingForm;
    }

    public Date getInactiveDate() {
        return inactiveDate;
    }

    public String getInactiveInd() {
        return inactiveInd;
    }

    public Number getLowStockVal() {
        return lowStockVal;
    }

    public Number getPercThres() {
        return percThres;
    }

    public String getBkgRefVal() {
        return bkgRefVal;
    }

    public String getTcCostCodeInd() {
        return tcCostCodeInd;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public String getResconInvoiceInd() {
        return resconInvoiceInd;
    }


    public Set<ValidTravelProduct> getValidTravelProduct() {
        return validTravelProduct;
    }

    @OneToMany(mappedBy = "operator")

//    @JoinTable(name = "operator",
//
//            joinColumns = @JoinColumn(name = "operator_cd", referencedColumnName = "operator_cd"),
//            inverseJoinColumns = @JoinColumn(name = "operator_cd", referencedColumnName = "operator_cd"))
    private Set<ValidTravelProduct> validTravelProduct = new HashSet<>();

}
