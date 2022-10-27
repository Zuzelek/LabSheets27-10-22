package labsheet7.sampleprogram;

//Product.java
/*A simple instantiable class definition for a Product*/

public class Product {
        private int id;
        private String name;
        private String description;
        private static int count = 1000000;

        public Product(int id, String name, String description) {
            setId(count);
            setName(name);
            setDescription(description);
            incrementCount();
        }
        public static int getCount(){

            return count;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }

        public String toString() {
            return "Product details are as follows: id: " + (getId()+1) + "  name: " + getName() + "  description: " + getDescription();
        }
        private static void incrementCount(){

            count++;
        }
}

