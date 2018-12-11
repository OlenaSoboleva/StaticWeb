package springboot.dal.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BUDGET_CTR")
public class BudgetCtr {
    @Id
    @Column(name="branch_budget_ctr")
    Integer branchBudgetCtr;
    @Column(name="budget_ctr_name")
    String budgetCtrName;
    @Column(name="budget_type")
    String budgetType;
    @Column(name="inactive_date")
    Date inactiveDate;
    @Column(name="inactive_ind")
     String inactiveInd;
    @Column(name="ticket_mode")
    String ticketMode;

    public BudgetCtr(Integer branchBudgetCtr, String budgetCtrName, String budgetType, Date inactiveDate, String inactiveInd, String ticketMode) {
        this.branchBudgetCtr = branchBudgetCtr;
        this.budgetCtrName = budgetCtrName;
        this.budgetType = budgetType;
        this.inactiveDate = inactiveDate;
        this.inactiveInd = inactiveInd;
        this.ticketMode = ticketMode;
    }
    public BudgetCtr() {
    }

    public Integer getBranchBudgetCtr() {
        return branchBudgetCtr;
    }

    public String getBudgetCtrName() {
        return budgetCtrName;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public Date getInactiveDate() {
        return inactiveDate;
    }

    public String getInactiveInd() {
        return inactiveInd;
    }
    public String getTicketMode() {
        return ticketMode;
    }






}
