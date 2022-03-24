import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lqy;")

	@Export("username")
	Username username;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lqy;")

	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lnc;S)I", garbageValue = 
	"-8912")

	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)Lqy;", garbageValue = 
	"1157869936")

	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"-831214428")

	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"1796686320")

	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = 
	"(Lqy;Lqy;I)V", garbageValue = 
	"1975154648")

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