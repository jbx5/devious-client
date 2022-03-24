import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class141 extends class144 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-945029977)

	int field1629;
	@ObfuscatedName("o")
	byte field1626;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-292002615)

	int field1627;
	@ObfuscatedName("g")
	String field1628;

	@ObfuscatedSignature(descriptor = 
	"Lez;")

	final class145 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lez;)V")

	class141(class145 var1) {
		this.this$0 = var1;
		this.field1629 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;S)V", garbageValue = 
	"3239")

	void vmethod3096(Buffer var1) {
		var1.readUnsignedByte();
		this.field1629 = var1.readUnsignedShort();
		this.field1626 = var1.readByte();
		this.field1627 = var1.readUnsignedShort();
		var1.readLong();
		this.field1628 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ley;B)V", garbageValue = 
	"26")

	void vmethod3093(ClanChannel var1) {
		ClanChannelMember var2 = ((ClanChannelMember) (var1.members.get(this.field1629)));
		var2.rank = this.field1626;
		var2.world = this.field1627;
		var2.username = new Username(this.field1628);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(JLjava/lang/String;B)I", garbageValue = 
	"29")

	static final int method2990(long var0, String var2) {
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

		var4.encryptRsa(class65.field861, class65.field862);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var16 = class67.method1878();
			var5.writeBytes(var16, 0, var16.length);
		}

		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class65.field861, class65.field862);
		var7 = ItemLayer.stringCp1252NullTerminatedByteSize(var2);
		if ((var7 % 8) != 0) {
			var7 += 8 - (var7 % 8);
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(((var8.offset + var4.offset) + var5.offset) + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		String var10 = class29.method425(var9.array);

		try {
			URL var11 = new URL(class129.method2849("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write((("data2=" + class126.method2817(var10)) + "&dest=") + class126.method2817("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				int var15 = var14.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var15 == (-1)) {
					var13.close();
					var14.close();
					String var17 = new String(var9.array);
					if (var17.startsWith("OFFLINE")) {
						return 4;
					} else if (var17.startsWith("WRONG")) {
						return 7;
					} else if (var17.startsWith("RELOAD")) {
						return 3;
					} else if (var17.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while ((var9.offset > 0) && (var9.array[var9.offset - 1] == 0)) {
							--var9.offset;
						} 

						var17 = new String(var9.array, 0, var9.offset);
						if (Login.method1945(var17)) {
							class11.openURL(var17, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var15;
			} while (var9.offset < 1000 );

			return 5;
		} catch (Throwable var18) {
			var18.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1812294948")

	public static void method2995() {
		StructComposition.StructDefinition_cached.clear();
	}
}