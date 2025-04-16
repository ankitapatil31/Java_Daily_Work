package april8.Comparable;

public class ProductList  implements Comparable<ProductList>{
        int Id;
        String Name;
        String Description;

        ProductList(int id, String name, String description){
            this.Id = id;
            this.Name = name;
            this.Description = description;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        @Override
        public String toString() {
            return "Productlist{" +
                    "Id=" + Id +
                    ", Name='" + Name + '\'' +
                    ", Description='" + Description + '\'' +
                    '}';
        }


    @Override
    public int compareTo(ProductList o) {
         return this.getName().compareTo(o.Name);
    }
}
