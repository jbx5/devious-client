import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)I",
		garbageValue = "-1406397913"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)Lvv;",
		garbageValue = "80"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1506605921"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-85"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lvv;Lvv;B)V",
		garbageValue = "70"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.username = var1;
			this.previousUsername = var2;
		}
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((User)var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-255329894"
	)
	public static int method8638(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}
}
