+---------------------+
|      Bill           |
+---------------------+
| - amount: double    |
+---------------------+
| +getAmount(): double|
| +setAmount(double): void|
| +calculateDiscount(): double|
+---------------------+
^
|
|
+---------------------+
|     Discount        |
+---------------------+
| +calculate(double): double|
+---------------------+
^
|
|
+---------------------+
|   EmployeeDiscount  |
+---------------------+
| +calculate(double): double|
+---------------------+

+---------------------+
|  AffiliateDiscount  |
+---------------------+
| +calculate(double): double|
+---------------------+

+---------------------+
|  CustomerDiscount   |
+---------------------+
| +calculate(double): double|
+---------------------+

+---------------------+
|  BulkDiscount       |
+---------------------+
| +calculate(double): double|
+---------------------+

+---------------------+
|   DiscountFactory   |
+---------------------+
| +getDiscount(User): Discount|
+---------------------+

+---------------------+
|   User              |
+---------------------+
| -type: String       |
| -customerSince: Date|
+---------------------+
| +getType(): String  |
| +getCustomerSince(): Date|
+---------------------+
