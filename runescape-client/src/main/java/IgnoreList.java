import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	final LoginType field4954;

	@ObfuscatedSignature(
		descriptor = "(Lub;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.field4954 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lss;",
		garbageValue = "-1113906309"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[Lss;",
		garbageValue = "-1325336376"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)V",
		garbageValue = "1583119522"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 4) {
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field4954);
				if (!var10.hasCleanName()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				class425.friendSystem.removeIgnore(var10.getName(), var11);
			} else {
				boolean var4 = (var3 & 1) != 0;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field4954);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field4954);
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpo;IIB)Lvt;",
		garbageValue = "-94"
	)
	static IndexedSprite method8792(AbstractArchive var0, int var1, int var2) {
		if (!HttpJsonRequestBody.method9207(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite();
			var4.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var4.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var4.xOffset = HttpAuthenticationHeader.SpriteBuffer_xOffsets[0];
			var4.yOffset = Login.SpriteBuffer_yOffsets[0];
			var4.subWidth = GrandExchangeEvents.SpriteBuffer_spriteWidths[0];
			var4.subHeight = ModelData0.SpriteBuffer_spriteHeights[0] * 1445511424;
			var4.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
			var4.pixels = MusicPatchPcmStream.SpriteBuffer_pixels[0];
			class151.method3492();
			return var4;
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)V",
		garbageValue = "292415890"
	)
	static void method8786(WorldView var0) {
		if (Client.renderSelf) {
			Decimator.addPlayerToScene(var0, Client.localPlayerIndex, false);
		}

	}
}
