package checkpackage;

import hello.packages.Library;

public class CheckPackage {

    public String getName() {
        Library lib = new Library();
        return lib.sayName();
    }
}
