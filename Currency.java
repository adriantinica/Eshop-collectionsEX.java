public enum Currency{

        USD("United States Dollar"),
        EUR("Euro"),
        MDL("Moldavian Leu");

        private String fullName;
    
        Currency(String fullName) {
            this.fullName = fullName;
        }
    
        public String getFullName() {

            return fullName;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return fullName;
        }

        



    }

    //HW1: redeclare currency of a certain enum type
    