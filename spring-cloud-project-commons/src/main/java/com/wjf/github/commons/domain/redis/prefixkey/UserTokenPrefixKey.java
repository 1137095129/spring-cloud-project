package com.wjf.github.commons.domain.redis.prefixkey;

public class UserTokenPrefixKey extends BasePrefixKey {

	private static final long serialVersionUID = 2605987123855489810L;

	public UserTokenPrefixKey() {
		super(-1, "user_Token");
	}

	private UserTokenPrefixKey(int expire) {
		super(expire, "user_token");
	}

	public static UserTokenPrefixKey getUserTokenPrefixKey() {
		return new UserTokenPrefixKey();
	}

	public static UserTokenPrefixKey getUserTokenPrefixKey(int expire) {
		return new UserTokenPrefixKey(expire);
	}
}
