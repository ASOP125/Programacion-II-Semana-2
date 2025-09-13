public class Paciente {
        private String nombreCompleto;
        private String dpi;
        private int edad;


        // Getters y Setters
        public String getNombreCompleto() {return nombreCompleto;}
        public void setNombreCompleto(String nombreCompleto) {this.nombreCompleto = nombreCompleto;}
        public String getDpi() {return dpi;}
        public void setDpi(String dpi) {this.dpi = dpi;}
        public int getEdad() {return edad;}
        public void setEdad(int edad) {this.edad = edad;}


        //Constructor completo
        public Paciente(String nombreCompleto, String dpi, int edad) {
            this.nombreCompleto = nombreCompleto;
            this.dpi = dpi;
            this.edad = edad;
        }

        //Constructor por defecto
         public Paciente(){
            this.nombreCompleto = "";
            this.dpi = "";
            this.edad = 0;
         }
        // Sobrecarga de constructores
          public Paciente(String nombreCompleto, String dpi) {
            this.nombreCompleto = nombreCompleto;
            this.dpi = dpi;
            this.edad = 0; //Por defecto
          }

          //Metodo para mostrar informacion del paciente
           public void mostrarInfoPaciente(){
            System.out.println("Paciente: " + nombreCompleto + " | Edad: " + edad + " | DPI: " + dpi);}

    }
