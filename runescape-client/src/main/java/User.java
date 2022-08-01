import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nd")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lqi;")
	@Export("username")
	Username username;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lqi;")
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lnd;I)I", garbageValue = "1115853399")
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(B)Lqi;", garbageValue = "42")
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1429277221")
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "5")
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(Lqi;Lqi;I)V", garbageValue = "-1289684227")
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
		return this.compareTo_user(((User) (var1)));
	}
}