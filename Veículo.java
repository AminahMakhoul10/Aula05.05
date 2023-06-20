public class Veículo {
		private int placa;
	    private String cor;
	    private int Nrdepassageiros;
	    private int capacidadetanque;
	    private int velocidadeMax;
	    private int velocidadeAtual;
	    private int consumoMedio;
	    
		
		public int getPlaca () {
			return this.placa;
		}
		
		public void setPlaca(int placa) {
			this.placa = placa;
		}
		
		
		public String getCor () {
			return this.cor;
		}
		
		public String setCor (String cor) {
			return this.cor = cor;
		}
		
		
		
		public int getNrdepassageiros () {
			return this.Nrdepassageiros;
		}
		
		public void setNrdepassageiros(int Nrdepassageiros) {
			this.Nrdepassageiros = Nrdepassageiros;
		}
		
		
		
		public int getCapacidadetanque() {
			return this.capacidadetanque;
		}
		
		public void setCapacidadetanque (int capacidadetanque) {
			this.capacidadetanque = capacidadetanque;
		}
		

        
		public int getVelocidademax() {
			return this.velocidadeMax;
		}
		
		public void setVelocidademax(int velocidadeMax) {
			this.velocidadeMax = velocidadeMax;
		}
		


		public int getVelocidadeatual() {
			return this.velocidadeAtual;
		}
		
		public void setVelocidadeatual(int velocidadeAtual) {
			this.velocidadeAtual = velocidadeAtual;
		}


		
		public int getConsumomedio() {
			return this.consumoMedio;
		}
		
		public void setConsumomedio (int consumoMedio) {
			this.consumoMedio = consumoMedio;
		}

	}

