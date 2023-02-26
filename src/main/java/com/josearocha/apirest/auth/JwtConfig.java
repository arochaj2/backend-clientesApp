package com.josearocha.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA="alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEowIBAAKCAQEAvSkAAQaTqsm/5cqA5QAM76fyhcKgTCyDq6KjrP99q/Tv1C3p\r\n"
			+ "nCjJtTUo+yfH6fU73bPRIPo7V5cPtm7mYBuFHoMked7RU/JE+XxNqR6+0DH4R0d+\r\n"
			+ "D1r6gZgmiuTjo9MB6iImiPDHKl3ZbrHYyS1P7yxQ3Z4MsBwI0PN/gO1Wr+JvGZom\r\n"
			+ "Pb2uekRxsMhwe1k3dYBGS2l5DT750tLfxwTs8PBx9357i1ZbFNP7SLaBzl9+b6hR\r\n"
			+ "QE4cvl8vuALOFQZ+m3LKSE5+pSVTTNU7gJchi51WnO223vjlXvMdxsbnRj4r3RcQ\r\n"
			+ "J7IvdNosngkbKPeedgeWirvaHvALFY+V90nbRQIDAQABAoIBAFMCoxXQJQ1V6/iT\r\n"
			+ "nWzhUMv7D9rTRjUnc8DmZp2MoUHNA1JBs7rry1jSM2HEW164V8U7HBM0vMX7bNHK\r\n"
			+ "aR7T9N8m/eLdfU8xikNR4WLOMz56L1JYdWGXs0cb1g4t1BgYiUaOJgsCXuSgusJx\r\n"
			+ "GYlvcRysffBDY54FL3lC4jlZ7ijQm4kvzOJE+ENlqGrtS9gZ4KTutUHsC3xnhjot\r\n"
			+ "eR3c3fgfDKQ+Rpz/gsg98Z/C9jgWyhle5WDqF+WNdL2UD+U+jrkF+9GDqAvkVojf\r\n"
			+ "az2EWkWBEXqSv4in160T0uzYm4AzEbeDVHiSSrrDNRlWRYBFj9bPjnY7UtWOfKkh\r\n"
			+ "EO7mqCECgYEA8wLPtjie0YkSiEiDtuhaWNUbH53JfctOE1cOBjCaRnPP9d7sEJYI\r\n"
			+ "39lzAtgsq6fBbmuBdUxjWeeHcYWHgTfJGzBtQ5K5LQ5IQEpOlBNAzxRnOQXqtY+H\r\n"
			+ "oDu0h6eUI7mHdsUeHiK1pS9h5C5GEM1JL8n6v1nA453dsYOT3IFxJfsCgYEAx0VV\r\n"
			+ "GcQpGEHAgu5OWWSEBpYBFN6/jPMDdnR4+2Hz6L2rcb3A0kE6rxM1uriP6EhBU+DA\r\n"
			+ "ZixR7+sXBztN9kLeyUCJ3M6C7sD7GnDG/cLK90ziBo6AB/lIrWqjEE/yGiJEeC+j\r\n"
			+ "9NVJauTbMeTNF2cMNwSkCzG/a/4tCK3YvfJlf78CgYBvErLkBB87gN6Soipp+OwK\r\n"
			+ "vGUoX1OQhtOJ7XmAhMiPOTItnJXjwuANiPOTskFAuG2mTccfWSn0FuqGjdTw0BHA\r\n"
			+ "trLKdw7itCt8Dzq5Xc96l0XS/4xXLmJ8b63Fb2g7p/pt5A0vEwhZlz20MR5fYaV5\r\n"
			+ "DWXp/lk28Jo7H/v+hr+z7wKBgQChhBD2UYj9oE3p0j6vNknNDMjTobihBlhIKx/k\r\n"
			+ "ogCRJStRhfxEb5qhTXC/Z9k87VQGKKXKKyI+1M5Vjjwi3xC1DxqvXrPB0am2RLMF\r\n"
			+ "/F2HFUofBmHAFM5TwZtqHWKezCezQuoiCL75ZYZFaq7RyTSdY6WTbT86yUq3PjHv\r\n"
			+ "xAmBAQKBgB8xj/AktbrMLtspY00EKQiMte14BnQ+w01BpH/YR8NBn4gf/jDBZFY1\r\n"
			+ "BjUYGb9sa7ojNHMFERuUCaHvbRzMY3hT79EjaNc8O5mzKylUzabSk2LgsI5/zKt8\r\n"
			+ "z0h++G8MbmxZH4G4sNFkvc6KXV1PhDmNk7C9POt2KUL67quwie2S\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvSkAAQaTqsm/5cqA5QAM\r\n"
			+ "76fyhcKgTCyDq6KjrP99q/Tv1C3pnCjJtTUo+yfH6fU73bPRIPo7V5cPtm7mYBuF\r\n"
			+ "HoMked7RU/JE+XxNqR6+0DH4R0d+D1r6gZgmiuTjo9MB6iImiPDHKl3ZbrHYyS1P\r\n"
			+ "7yxQ3Z4MsBwI0PN/gO1Wr+JvGZomPb2uekRxsMhwe1k3dYBGS2l5DT750tLfxwTs\r\n"
			+ "8PBx9357i1ZbFNP7SLaBzl9+b6hRQE4cvl8vuALOFQZ+m3LKSE5+pSVTTNU7gJch\r\n"
			+ "i51WnO223vjlXvMdxsbnRj4r3RcQJ7IvdNosngkbKPeedgeWirvaHvALFY+V90nb\r\n"
			+ "RQIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
