import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
@ObfuscatedName("pr")
public class class427 extends class392 implements class251 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llh;")
	final AbstractArchive field4650;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lic;")
	final DemotingHashTable field4648;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 49618459)
	final int field4649;

	@ObfuscatedSignature(descriptor = "(Lkx;ILlb;Llh;)V")
	public class427(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4648 = new DemotingHashTable(64);
		this.field4650 = var4;
		this.field4649 = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Loj;", garbageValue = "-231569171")
	protected class394 vmethod7521(int var1) {
		synchronized(this.field4648) {
			class393 var2 = ((class393) (this.field4648.get(((long) (var1)))));
			if (var2 == null) {
				var2 = this.method7522(var1);
				this.field4648.method5130(var2, ((long) (var1)));
			}
			return var2;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(II)Lor;", garbageValue = "-1832880212")
	class393 method7522(int var1) {
		byte[] var2 = this.field4650.takeFile(this.field4649, var1);
		class393 var3 = new class393(var1);
		if (var2 != null) {
			var3.method7073(new Buffer(var2));
		}
		return var3;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "4")
	public void method7525() {
		synchronized(this.field4648) {
			this.field4648.clear();
		}
	}

	public Iterator iterator() {
		return new class426(this);
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1896128691")
	static final int method7523() {
		if (class19.clientPreferences.method2245()) {
			return PacketWriter.Client_plane;
		} else {
			int var0 = 3;
			if (ViewportMouse.cameraPitch < 310) {
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) {
					var1 = InterfaceParent.oculusOrbFocalPointX >> 7;
					var2 = class141.oculusOrbFocalPointY >> 7;
				} else {
					var1 = class101.localPlayer.x >> 7;
					var2 = class101.localPlayer.y >> 7;
				}
				int var3 = class18.cameraX >> 7;
				int var4 = class228.cameraZ >> 7;
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
					return PacketWriter.Client_plane;
				}
				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
					return PacketWriter.Client_plane;
				}
				if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][var3][var4] & 4) != 0) {
					var0 = PacketWriter.Client_plane;
				}
				int var5;
				if (var1 > var3) {
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1;
				}
				int var6;
				if (var2 > var4) {
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2;
				}
				int var7;
				int var8;
				if (var5 > var6) {
					var7 = var6 * 65536 / var5;
					var8 = 32768;
					while (var3 != var1) {
						if (var3 < var1) {
							++var3;
						} else if (var3 > var1) {
							--var3;
						}
						if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][var3][var4] & 4) != 0) {
							var0 = PacketWriter.Client_plane;
						}
						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var4 < var2) {
								++var4;
							} else if (var4 > var2) {
								--var4;
							}
							if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][var3][var4] & 4) != 0) {
								var0 = PacketWriter.Client_plane;
							}
						}
					} 
				} else if (var6 > 0) {
					var7 = var5 * 65536 / var6;
					var8 = 32768;
					while (var4 != var2) {
						if (var4 < var2) {
							++var4;
						} else if (var4 > var2) {
							--var4;
						}
						if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][var3][var4] & 4) != 0) {
							var0 = PacketWriter.Client_plane;
						}
						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var3 < var1) {
								++var3;
							} else if (var3 > var1) {
								--var3;
							}
							if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][var3][var4] & 4) != 0) {
								var0 = PacketWriter.Client_plane;
							}
						}
					} 
				}
			}
			if (class101.localPlayer.x >= 0 && class101.localPlayer.y >= 0 && class101.localPlayer.x < 13312 && class101.localPlayer.y < 13312) {
				if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][class101.localPlayer.x >> 7][class101.localPlayer.y >> 7] & 4) != 0) {
					var0 = PacketWriter.Client_plane;
				}
				return var0;
			} else {
				return PacketWriter.Client_plane;
			}
		}
	}
}