interface Confidential {
}

class Document {
    String name;

    Document(String name) {
        this.name = name;
    }
}

class Report extends Document implements Confidential {
    Report(String name) {
        super(name);
    }
}

class Letter extends Document {
    Letter(String name) {
        super(name);
    }
}

public class DocManagement {
    public static void main(String[] args) {
        Document d1 = new Report("Financial Report");
        Document d2 = new Letter("Official Letter");

        if (d1 instanceof Confidential)
            System.out.println(d1.name + " is Confidential");

        if (d2 instanceof Confidential)
            System.out.println(d2.name + " is Confidential");
        else
            System.out.println(d2.name + " is not Confidential");
    }
}