package net.unethicalite.api.account;

public class GameAccount
{
	private final String username;
	private final String password;
	private String auth;

	public GameAccount(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	public String getUsername()
	{
		return username;
	}

	public String getPassword()
	{
		return password;
	}

	public String getAuth()
	{
		return auth;
	}

	public void setAuth(String auth)
	{
		this.auth = auth;
	}
}
