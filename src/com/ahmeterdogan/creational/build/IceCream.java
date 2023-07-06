package com.ahmeterdogan.creational.build;

/*
Karmaşık bir nesneyi tek satırda oluşturmaya çalışıyoruz. Parça parça nesnemizi oluşturuyoruz.
Bazı parçaları istemiyorsak set etmiyoruz. Builder sınıfının metotlarından this anahtar kelimesini
return ederek fluent şekilde nesne oluşturabiliyoruz.
 */
public class IceCream {
    private int vanilla;
    private int chocolate;
    private int strawberry;
    private boolean nuts;

    private IceCream() {

    }

    //Nested class kullanmak yerine bu sınıfı ayrı bir sınıf olarak da tanımlayabilirdik. Ancak böyle daha hoşuma gitti :)
    public static class Builder {
        private final IceCream iceCream = new IceCream();

        public Builder setVanilla(int scoop) {
            this.iceCream.setVanilla(scoop);
            return this;
        }
        public Builder setChocolate(int scoop) {
            this.iceCream.setChocolate(scoop);
            return this;
        }
        public Builder setStrawberry(int scoop) {
            this.iceCream.setStrawberry(scoop);
            return this;
        }
        public Builder setContainsNuts(boolean b) {
            this.iceCream.setContainsNuts(b);
            return this;
        }


        public IceCream build() {
            return iceCream;
        }
    }

    public int getVanilla() {
        return vanilla;
    }

    public void setVanilla(int vanilla) {
        this.vanilla = vanilla;
    }

    public int getChocolate() {
        return chocolate;
    }

    public void setChocolate(int chocolate) {
        this.chocolate = chocolate;
    }

    public int getStrawberry() {
        return strawberry;
    }

    public void setStrawberry(int strawberry) {
        this.strawberry = strawberry;
    }

    public boolean isContainsNuts() {
        return nuts;
    }

    public void setContainsNuts(boolean nuts) {
        this.nuts = nuts;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "vanilla=" + vanilla +
                ", chocolate=" + chocolate +
                ", strawberry=" + strawberry +
                ", nuts=" + nuts +
                '}';
    }
}

class App {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream.Builder()
                .setChocolate(2)
                .setVanilla(2)
                .setStrawberry(2)
                .setContainsNuts(true)
                .build();

        System.out.println(iceCream);

    }
}
