
//* TODO: importar e conhecer a classe Scanner */

public class ContaTerminal {
        /*
         * numero - int
         * Agencia - String
         * nomeClinete - String
         * Saldo - Float
         * 
         */

        /* várivaeis da conta */
         private String agencia;
         private int numero;
         private String nomeClinete;
         private float saldo;


        public ContaTerminal(String agencia,int numero, String nome, float saldo){
            setAgencia(agencia);
            setNumero(numero);
            setNomeClinete(nome);
            setSaldo(saldo);
            bemVindo();
        }

        /* métodos setter e getter da classe contaTerminal */

        private void setAgencia(String agencia) {
            this.agencia = agencia;
        }
        private String getAgencia() {
            return agencia;
        }
        private void setNomeClinete(String nomeClinete) {
            this.nomeClinete = nomeClinete;
        }
        private String getNomeClinete() {
            return nomeClinete;
        }
        private void setNumero(int numero) {
            this.numero = numero;
        }
        private int getNumero() {
            return numero;
        }
        private void setSaldo(float saldo) {
            this.saldo = saldo;
        }
        private float getSaldo() {
            return saldo;
        }

         //* Exibit as mensagens para o usuário */
          /*
         * método para mostrar status da conta
         */
        public void mostrarStatus(){
            System.out.println("=========== STATUS ACCOUNT =========== ");
            System.out.println("olá cliente "+getNomeClinete());
            System.out.println("Conta: "+getNumero()+ "Agência "+this.getAgencia());
            System.out.println("Saldo : "+this.getSaldo());
        }
            //* exibir a mensagem de conta criada  */
        public void bemVindo(){
            System.out.println("Olá "+this.getNomeClinete()+ ", obrigado por criar uma conta em nosso banco, sua agência é " +this.getAgencia()+", conta " +this.getNumero()+" e seu saldo "+this.getSaldo()+ " já está disponível para saque");
        }
}
