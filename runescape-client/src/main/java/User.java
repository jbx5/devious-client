import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lqb;")

	@Export("username")
	Username username;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lqb;")

	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lnn;I)I", garbageValue = 
	"842367957")

	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(B)Lqb;", garbageValue = 
	"0")

	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"-348962548")

	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"1206801353")

	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"(Lqb;Lqb;B)V", garbageValue = 
	"39")

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

	@ObfuscatedName("jh")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"53251261")

	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}