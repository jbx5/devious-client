import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	static ClanChannel field4920;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsz;I)I",
		garbageValue = "1336181307"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "-394111872"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-86141728"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2096673026"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lvf;Lvf;B)V",
		garbageValue = "58"
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
