import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("eb")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1496139277)

	@Export("count")
	int count;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1765114105)

	@Export("cycle")
	int cycle;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-820996673)

	@Export("type")
	int type;
	@ObfuscatedName("f")
	@Export("sender")
	String sender;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lqb;")

	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("l")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("q")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue = 
	"-56")

	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = (++Messages.Messages_count) - 1;
		this.count = var5;
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1771611339")

	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"46")

	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-799651703")

	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = (Decimator.friendSystem.friendsList.contains(this.senderUsername)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1801173346")

	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-1804603647")

	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"206265672")

	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = (Decimator.friendSystem.ignoreList.contains(this.senderUsername)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1910614922")

	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class160.method3280(this.sender), class122.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)Ljava/io/File;", garbageValue = 
	"-717808877")

	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = ((File) (FileSystem.FileSystem_cacheFiles.get(var0)));
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(class120.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lkt;", garbageValue = 
	"620716737")

	public static StudioGame[] method1116() {
		return new StudioGame[]{ StudioGame.oldscape, StudioGame.game4, StudioGame.runescape, StudioGame.game3, StudioGame.game5, StudioGame.stellardawn };
	}
}