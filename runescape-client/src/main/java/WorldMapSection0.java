import net.runelite.mapping.ObfuscatedName;
import java.net.MalformedURLException;
import java.io.InputStream;
import net.runelite.mapping.Implements;
import java.io.IOException;
import net.runelite.rs.ScriptOpcodes;
import java.net.URLConnection;
import java.net.URL;
import java.util.Random;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.OutputStreamWriter;
import net.runelite.mapping.Export;
@ObfuscatedName("hd")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1533132055)
	@Export("oldZ")
	int oldZ;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 490387531)
	@Export("newZ")
	int newZ;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 810697233)
	@Export("oldX")
	int oldX;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 459646283)
	@Export("oldY")
	int oldY;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -86663039)
	@Export("newX")
	int newX;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1253262399)
	@Export("newY")
	int newY;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -853639905)
	@Export("oldChunkXLow")
	int oldChunkXLow;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 1143084627)
	@Export("oldChunkYLow")
	int oldChunkYLow;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -2018676367)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 1791223475)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1083500843)
	@Export("newChunkXLow")
	int newChunkXLow;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 570777789)
	@Export("newChunkYLow")
	int newChunkYLow;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = -1627261971)
	@Export("newChunkXHigh")
	int newChunkXHigh;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 734054673)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lht;I)V", garbageValue = "362337348")
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}
		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}
		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}
		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IIIS)Z", garbageValue = "-6948")
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-1464078865")
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIII)[I", garbageValue = "2119764221")
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{ this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8) };
			return var4;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)Lku;", garbageValue = "-1688632698")
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqr;B)V", garbageValue = "-89")
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-4")
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(JLjava/lang/String;I)I", garbageValue = "2062014732")
	static final int method4852(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{ var3.nextInt(), var3.nextInt(), ((int) (var0 >> 32)), ((int) (var0)) };
		var4.writeByte(10);
		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}
		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}
		var4.encryptRsa(class65.field849, class65.field850);
		var5.writeByte(10);
		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}
		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var8 = new byte[24];
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var8);
				int var9;
				for (var9 = 0; var9 < 24 && var8[var9] == 0; ++var9) {
				}
				if (var9 >= 24) {
					throw new IOException();
				}
			} catch (Exception var26) {
				for (int var10 = 0; var10 < 24; ++var10) {
					var8[var10] = -1;
				}
			}
			var5.writeBytes(var8, 0, var8.length);
		}
		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class65.field849, class65.field850);
		var7 = class309.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}
		Buffer var27 = new Buffer(var7);
		var27.writeStringCp1252NullTerminated(var2);
		var27.offset = var7;
		var27.xteaEncryptAll(var6);
		Buffer var20 = new Buffer(var27.offset + var4.offset + var5.offset + 5);
		var20.writeByte(2);
		var20.writeByte(var4.offset);
		var20.writeBytes(var4.array, 0, var4.offset);
		var20.writeByte(var5.offset);
		var20.writeBytes(var5.array, 0, var5.offset);
		var20.writeShort(var27.offset);
		var20.writeBytes(var27.array, 0, var27.offset);
		byte[] var11 = var20.array;
		String var22 = class326.method5963(var11, 0, var11.length);
		String var12 = var22;
		try {
			URL var13 = new URL(ModeWhere.method6005("services", false) + "m=accountappeal/login.ws");
			URLConnection var14 = var13.openConnection();
			var14.setDoInput(true);
			var14.setDoOutput(true);
			var14.setConnectTimeout(5000);
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
			var15.write("data2=" + class11.method108(var12) + "&dest=" + class11.method108("passwordchoice.ws"));
			var15.flush();
			InputStream var16 = var14.getInputStream();
			var20 = new Buffer(new byte[1000]);
			do {
				int var17 = var16.read(var20.array, var20.offset, 1000 - var20.offset);
				if (var17 == -1) {
					var15.close();
					var16.close();
					String var23 = new String(var20.array);
					if (var23.startsWith("OFFLINE")) {
						return 4;
					} else if (var23.startsWith("WRONG")) {
						return 7;
					} else if (var23.startsWith("RELOAD")) {
						return 3;
					} else if (var23.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var20.xteaDecryptAll(var6);
						while (var20.offset > 0 && var20.array[var20.offset - 1] == 0) {
							--var20.offset;
						} 
						var23 = new String(var20.array, 0, var20.offset);
						boolean var18;
						if (var23 == null) {
							var18 = false;
						} else {
							label101 : {
								try {
									new URL(var23);
								} catch (MalformedURLException var24) {
									var18 = false;
									break label101;
								}
								var18 = true;
							}
						}
						if (var18) {
							class400.openURL(var23, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}
				var20.offset += var17;
			} while (var20.offset < 1000 );
			return 5;
		} catch (Throwable var25) {
			var25.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-626299447")
	static int method4869(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}
			var0 += 30;
			var0 += (var2 != 1 && var2 != 3) ? 5 : 20;
		}
		return 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "-1483324777")
	static int method4868(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			User.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}
			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "-2118428310")
	static String method4870(String var0) {
		PlayerType[] var1 = class220.PlayerType_values();
		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(SoundSystem.method740(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}
		return var0;
	}
}