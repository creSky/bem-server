public enum PayrollDay {
    Mon,Tue,Wed,THU,FIR,Sat(Paytype.WEEKEND),SUN(Paytype.WEEKEND);


    private  final Paytype paytype;

    PayrollDay(Paytype paytype){this.paytype=paytype;}
    PayrollDay(){this(Paytype.WEEKDAY);}

    int pay(int minutesWorked,int payRate){
        return paytype.pay(minutesWorked,payRate);
    }


    private enum Paytype{
        WEEKDAY{
            int overtimePay(int minsWorked,int payRate){
                return minsWorked<=MINS_PRE_SHIFT?0:
                        (minsWorked-MINS_PRE_SHIFT)*payRate/2;
            }
        },
        WEEKEND{
            int overtimePay(int minsWorked,int payRate){
                return (minsWorked-MINS_PRE_SHIFT)*payRate/2;
            }
        };

        abstract int overtimePay(int mins,int payRate);
        private static final int MINS_PRE_SHIFT=8*60;

        int pay(int minsWorked,int payRate){
            int basePay=minsWorked*payRate;
            return basePay+overtimePay(minsWorked,payRate);
        }
    }
}
