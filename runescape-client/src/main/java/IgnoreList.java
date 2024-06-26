import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	final LoginType field4914;

	@ObfuscatedSignature(
		descriptor = "(Luu;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.field4914 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lsk;",
		garbageValue = "99"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsk;",
		garbageValue = "-2040243144"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "-2025519979"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 4) {
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field4914);
				if (!var10.hasCleanName()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				class135.friendSystem.removeIgnore(var10.getName(), var11);
			} else {
				boolean var4 = (var3 & 1) != 0;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field4914);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field4914);
				var1.readStringCp1252NullTerminated();
				if (!var5.hasCleanName()) {
					throw new IllegalStateException();
				}

				Ignored var7 = (Ignored)this.getByCurrentUsername(var5);
				if (var4) {
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
					if (var8 != null && var7 != var8) {
						if (var7 != null) {
							this.remove(var8);
						} else {
							var7 = var8;
						}
					}
				}

				if (var7 != null) {
					this.changeName(var7, var5, var6);
				} else if (this.getSize() < 400) {
					int var9 = this.getSize();
					var7 = (Ignored)this.addLast(var5, var6);
					var7.id = var9;
				}
			}
		}

	}
}
