package co.edu.uco.tiendaonline.data.entity;

public class CorreoElectronicoClienteEntity {
	public String correoElectronico;
	public boolean correoElectronicoConfirmado;
		
		
		private CorreoElectronicoClienteEntity( final String correoElectronico, final boolean correoElectronicoConfirmado) {
			setCorreoElectronico(correoElectronico);
			setCorreoElectronicoConfirmado(correoElectronicoConfirmado);
		}

		public static final CorreoElectronicoClienteEntity crear(final String correoElectronico, final boolean correoElectronicoConfirmado) {
			return new CorreoElectronicoClienteEntity(correoElectronico, correoElectronicoConfirmado);
		}


		private final void setCorreoElectronico(String correoElectronico) {
			this.correoElectronico = correoElectronico;
		}



		private final void setCorreoElectronicoConfirmado(boolean correoElectronicoConfirmado) {
			this.correoElectronicoConfirmado = correoElectronicoConfirmado;
		}



		public final String getCorreoElectronico() {
			return correoElectronico;
		}



		public final boolean isCorreoElectronicoConfirmado() {
			return correoElectronicoConfirmado;
		}
		

}