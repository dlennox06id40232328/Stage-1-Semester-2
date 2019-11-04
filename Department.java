package part01;

public enum Department {
	SPA_WELLBEING {

		@Override
		public String description() {
			return "Spa and Wellbeing";
		}
	},
	CATERING {

		@Override
		public String description() {
			return "Catering";
		}
	},
	HOUSEKEEPING {

		@Override
		public String description() {
			return "Housekeeping";
		}
	},
	HOSPITALITY {

		@Override
		public String description() {
			return "Hospitality";
		}
	};
	
	public abstract String description();

}
