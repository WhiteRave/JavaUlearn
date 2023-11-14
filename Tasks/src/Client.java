/*
public abstract class Client {
    protected double amount;

    public abstract double getAmount();

    public abstract void put(double amountToPut);

    public abstract void take(double amountToTake);
}

public class PhysicalPerson extends Client {
    public double getAmount() {
        return amount;
    }
    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amount += amountToPut;
        }
    }

    public void take(double amountToTake) {
        if (amountToTake > 0 && amountToTake <= amount) {
            amount -= amountToTake;
        }
    }
}

public class LegalPerson extends PhysicalPerson {
    public void take(double amountToTake) {
        var amountWithComission = amountToTake * 0.99;
        if (amountToTake > 0 && amountWithComission <= amount) {
            amount -= amountWithComission;
        }
    }
}

public class IndividualBusinessman extends PhysicalPerson {
    public void put(double amountToPut) {
        if (amountToPut > 0 && amountToPut < 1000) {
            amount += amountToPut * 0.99;
        }

        if (amountToPut >= 1000) {
            amount += amountToPut * 0.995;
        }
    }
}
*/