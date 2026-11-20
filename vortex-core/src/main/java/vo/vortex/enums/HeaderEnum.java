package vo.vortex.enums;

/**
 * header
 *
 * @author zhangzhen
 * @date 2024年12月31日 下午6:52:27
 *
 */
public enum HeaderEnum {

	SET_COOKIE("set-cookie", "set-cookie".getBytes()),

	CONTENT_ENCODING("content-encoding", "content-encoding".getBytes()),

	Z_SESSION_ID("zsessionid", "zsessionid".getBytes()),

	HOST("host", "host".getBytes()),

	TRANSFER_ENCODING("transfer-encoding", "transfer-encoding".getBytes()),

	ACCEPT_ENCODING("accept-encoding", "accept-encoding".getBytes()),

	VARY("vary", "vary".getBytes()),

	COOKIE("cookie", "cookie".getBytes()),

	UPGRADE("upgrade", "upgrade".getBytes()),

	EXPECT("expect", "expect".getBytes()),

	CONTENT_DISPOSITION("content-disposition", "content-disposition".getBytes()),

	CONTENT_TYPE("content-type", "content-type".getBytes()),

	ALLOW("allow", "allow".getBytes()),

	USER_AGENT("user-agent", "user-agent".getBytes()),

	SERVER("server", "server".getBytes()),

	CONNECTION("connection", "connection".getBytes()),

	CACHE_CONTROL("cache-control", "cache-control".getBytes()),

	LAST_MODIFIED("last-modified", "last-modified".getBytes()),

	CONTENT_LENGTH("content-length", "content-length".getBytes()),

	IF_MODIFIED_SINCE("if-modified-since", "if-modified-since".getBytes()),

	IF_NONE_MATCH("if-none-match", "if-none-match".getBytes()),

	DATE("date", "date".getBytes()),

	ETAG("etag", "etag".getBytes()),

	REFERER("referer", "referer".getBytes()),

	X_REAL_IP("x-real-ip", "x-real-ip".getBytes()),

	X_Forwarded_For("x-forwarded-for", "x-forwarded-for".getBytes()),

	;

	private final String name;
	private final byte[] nameBytes;

	HeaderEnum(final String name, final byte[] nameBytes) {
		this.name = name;
		this.nameBytes = nameBytes;
	}

	public String getName() {
		return this.name;
	}

	public byte[] getNameBytes() {
		return this.nameBytes;
	}

}
