CREATE TABLE ADDRESS
(
A_ID NUMBER NOT NULL,
A_STREET VARCHAR2(4000),
A_CITY VARCHAR2(4000),
A_STATE VARCHAR2(4000),
A_ZIP VARCHAR2(4000),
CONSTRAINT ADDRESS_PK PRIMARY KEY (A_ID)
);

CREATE TABLE PRODUCT(
PRODUCT_ID NUMBER NOT NULL,
PRODUCT_NAME NUMBER NOT NULL UNIQUE,
PRODUCT_SUPPLIERPRICE NUMBER NOT NULL,
PRODUCT_RETAILERPRICE NUMBER NOT NULL,
CONSTRAINT PRODUCT_PK PRIMARY KEY(PRODUCT_ID)

);

CREATE TABLE CATEGORYS(C_ID NUMBER NOT NULL, C_NAME VARCHAR2(4000 BYTE) UNIQUE, 
CONSTRAINT PK_C_ID PRIMARY KEY (C_ID));

CREATE TABLE PRODUCT_CATEGORY
(
P_ID NUMBER NOT NULL,
C_ID NUMBER NOT NULL,
CONSTRAINT PRODUCT_CATEGORY_PRODUCT_FK FOREIGN KEY (P_ID) REFERENCES PRODUCT,
CONSTRAINT PRODUCT_CATEGORY_CATEGORYS_FK FOREIGN KEY (C_ID) REFERENCES CATEGORYS
);

CREATE TABLE RETAILER
(
R_ID NUMBER NOT NULL,
R_NAME VARCHAR2(4000) UNIQUE NOT NULL,
R_ADDRESS NUMBER NOT NULL,
CONSTRAINT RETAILER_PK PRIMARY KEY (R_ID),
CONSTRAINT RETAILER_FK FOREIGN KEY (R_ADDRESS) REFERENCES ADDRESS
);

CREATE TABLE RETAILER_SALE
(
RS_ID NUMBER NOT NULL,
RS_RETAILER NUMBER NOT NULL,
RS_PRODUCT NUMBER NOT NULL,
RS_PRODUCT_QUANTITY NUMBER,
RS_COST NUMBER(38,2),
RS_TS DATE,
CONSTRAINT RETAILER_SALE_PK PRIMARY KEY (RS_ID),
CONSTRAINT RETAILER_SALE_RETAILER_FK FOREIGN KEY (RS_RETAILER) REFERENCES RETAILER,
CONSTRAINT RETAILER_SALE_PRODUCT_FK FOREIGN KEY (RS_PRODUCT) REFERENCES PRODUCT
);

CREATE TABLE SUPPLIER(S_ID NUMBER NOT NULL, S_NAME VARCHAR2(4000 BYTE)NOT NULL UNIQUE,
S_ADDRESS NUMBER NOT NULL, CONSTRAINT PK_A_ID PRIMARY KEY(S_ID), CONSTRAINT 
FK_S_ADDRESS FOREIGN KEY (S_ADDRESS) REFERENCES ADDRESS(A_ID));

CREATE TABLE RETAILER_SALE
(
RS_ID NUMBER NOT NULL,
RS_RETAILER NUMBER NOT NULL,
RS_PRODUCT NUMBER NOT NULL,
RS_PRODUCT_QUANTITY NUMBER,
RS_COST NUMBER(38,2),
RS_TS DATE,
CONSTRAINT RETAILER_SALE_PK PRIMARY KEY (RS_ID),
CONSTRAINT RETAILER_SALE_RETAILER_FK FOREIGN KEY (RS_RETAILER) REFERENCES RETAILER,
CONSTRAINT RETAILER_SALE_PRODUCT_FK FOREIGN KEY (RS_PRODUCT) REFERENCES PRODUCT
);

CREATE TABLE PURCHASE_ORDER(
	PO_ID NUMBER NOT NULL,
	PO_TIMESTAMP DATE NOT NULL,
	PO_SUPPLIER NUMBER NOT NULL,
	PO_RETAILER NUMBER NOT NULL,
	PO_COST NUMBER,
	CONSTRAINT PURCHASE_ORDER PRIMARY KEY(PO_ID),
	CONSTRAINT PURCHASE_ORDER_SUPPLIER_FK FOREIGN KEY (PO_SUPPLIER) REFERENCES SUPPLIER,
	CONSTRAINT PURCAHSE_ORDER_RETAILER_FK FOREIGN KEY (PO_RETAILER) REFERENCES RETAILER
	);
	
CREATE TABLE PO_LINE(
POL_ID NUMBER NOT NULL,
POL_PO NUMBER NOT NULL,
POL_PRODUCT NUMBER NOT NULL,
POL_QUANTITY NUMBER NOT NULL,
POL_COST NUMBER NOT NULL,
CONSTRAINT PO_LINE PRIMARY KEY(POL_ID),
CONSTRAINT PO_LINE_PURCHASE_ORDER_FK FOREIGN KEY (POL_PO) REFERENCES PURCHASE_ORDER,
CONSTRAINT PO_LINE_PRODUCT_FK FOREIGN KEY (POL_PRODUCT) REFERENCES PRODUCT
);
	

CREATE TABLE RETAILER_INVENTORY(RI_ID NUMBER NOT NULL, RI_RETAILER NUMBER NOT NULL, 
RI_PRODUCT NUMBER NOT NULL, RI_PRODUCT_QUANTITY NUMBER, RI_PRODUCT_THRESHOLD NUMBER, 
CONSTRAINT PK_RETAILER_INVENTORY PRIMARY KEY (RI_ID), CONSTRAINT FK_RI_RETAILER FOREIGN KEY 
(RI_RETAILER) REFERENCES RETAILER (R_ID), CONSTRAINT FK_RI_PRODUCT FOREIGN KEY (RI_PRODUCT)
REFERENCES PRODUCT(PRODUCT_ID));