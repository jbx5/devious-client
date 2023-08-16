import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1400140503
	)
	static int field4657;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqs;I)I",
		garbageValue = "1756748027"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Luc;",
		garbageValue = "807179111"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-346787089"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1703373764"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Luc;Luc;I)V",
		garbageValue = "-733820505"
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
}
