package data;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="bank_account")
public class BankAccount {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="ID", unique=true, nullable=false)
private Integer accountId;

@Column(name="ACC_TYPE", length=20)
private String accountType;

@Column(name="Bank Name", length=100)
private String bankName;

@Column(name="IFSC", unique=true)
private String ifsc;

public Integer getAccountId() {
	return accountId;
}

public void setAccountId(Integer accountId) {
	this.accountId = accountId;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public String getBankName() {
	return bankName;
}

public void setBankName(String bankName) {
	this.bankName = bankName;
}

public String getIfsc() {
	return ifsc;
}

public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}

public BankAccount(Integer accountId, String accountType, String bankName, String ifsc) {
	super();
	this.accountId = accountId;
	this.accountType = accountType;
	this.bankName = bankName;
	this.ifsc = ifsc;
}

public BankAccount() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "BankAccount [accountId=" + accountId + ", accountType=" + accountType + ", bankName=" + bankName + ", ifsc="
			+ ifsc + "]";
}


	
}
