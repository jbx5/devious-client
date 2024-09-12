import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsq;Lsq;I)I",
		garbageValue = "-1832657781"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ax")
	public static int method3190(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	static void method3196() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			Login.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = SceneTilePaint.method5415();
			int var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				var0 = class402.method7746(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				Login.setLoginResponseString(Strings.field4320, Strings.field4403, Strings.field4187);
				LoginState.updateLoginIndex(6);
				break;
			case 3:
				Login.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				Login.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				Login.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				Login.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				Login.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}
}
