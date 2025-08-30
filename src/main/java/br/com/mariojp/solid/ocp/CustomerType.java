package br.com.mariojp.solid.ocp;

public enum CustomerType {
	REGULAR(new RegularPolicy()), PREMIUM(new PremiumPolicy()), PARTNER(new PartnerPolicy());

	private final DiscountPolicy policy;

	CustomerType(DiscountPolicy policy) {
		this.policy = policy;
	}

	public DiscountPolicy getPolicy() {
		return policy;
	}


}
