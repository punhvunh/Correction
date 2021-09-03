package com.epam.travel.entity.tests;

public class Transport {

	private Double cost;
	private TransferList transfer;
	private Integer numberOfSeats;
	private Integer amountOfLuggage;

	public Transport() {
		super();
	}

	public Transport(Double cost, TransferList transfer, Integer numberOfSeats, Integer amountOfLuggage) {
		super();
		this.cost = cost;
		this.transfer = transfer;
		this.numberOfSeats = numberOfSeats;
		this.amountOfLuggage = amountOfLuggage;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public TransferList getTransfer() {
		return transfer;
	}

	public void setTransfer(TransferList transfer) {
		this.transfer = transfer;
	}

	private Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	private void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	private Integer getAmountOfLuggage() {
		return amountOfLuggage;
	}

	private void setAmountOfLuggage(Integer amountOfLuggage) {
		this.amountOfLuggage = amountOfLuggage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((numberOfSeats == null) ? 0 : numberOfSeats.hashCode());
		result = prime * result + ((amountOfLuggage == null) ? 0 : amountOfLuggage.hashCode());
		result = prime * result + ((transfer == null) ? 0 : transfer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transport other = (Transport) obj;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (numberOfSeats == null) {
			if (other.numberOfSeats != null)
				return false;
		} else if (!numberOfSeats.equals(other.numberOfSeats))
			return false;
		if (amountOfLuggage== null) {
			if (other.amountOfLuggage != null)
				return false;
		} else if (!amountOfLuggage.equals(other.amountOfLuggage))
			return false;
		if (transfer != other.transfer)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transfer [cost=");
		builder.append(cost);
		builder.append(", transfer=");
		builder.append(transfer);
		builder.append(", dateFrom=");
		builder.append(numberOfSeats);
		builder.append(", dateTo=");
		builder.append(amountOfLuggage);
		builder.append("]");
		return builder.toString();
	}

}




