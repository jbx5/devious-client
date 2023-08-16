import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class108 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1393;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1392;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1398;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1394;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1391;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1396;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1407;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1397;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1400;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1395;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1401;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1402;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1403;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1390;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1399;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static final class108 field1406;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1016712981
	)
	int field1405;

	static {
		field1393 = new class108(0);
		field1392 = new class108(1);
		field1398 = new class108(2);
		field1394 = new class108(3);
		field1391 = new class108(4);
		field1396 = new class108(5);
		field1407 = new class108(6);
		field1397 = new class108(7);
		field1400 = new class108(8);
		field1395 = new class108(9);
		field1401 = new class108(10);
		field1402 = new class108(11);
		field1403 = new class108(12);
		field1390 = new class108(13);
		field1399 = new class108(14);
		field1406 = new class108(15);
	}

	class108(int var1) {
		this.field1405 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	static void method2715() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class318.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(HorizontalAlignment.method3682("services", false) + "m=accountappeal/login.ws");
				URLConnection var4 = var3.openConnection();
				var4.setRequestProperty("connection", "close");
				var4.setDoInput(true);
				var4.setDoOutput(true);
				var4.setConnectTimeout(5000);
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
				var5.write("data1=req");
				var5.flush();
				InputStream var6 = var4.getInputStream();
				Buffer var7 = new Buffer(new byte[1000]);

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset);
					if (var8 == -1) {
						var7.offset = 0;
						long var10 = var7.readLong();
						var1 = var10;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var14) {
				var1 = 0L;
			}

			int var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				var0 = class318.method6018(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				class318.setLoginResponseString(Strings.field4176, Strings.field4177, Strings.field4178);
				PcmPlayer.method838(6);
				break;
			case 3:
				class318.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class318.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class318.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class318.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class318.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-154699452"
	)
	static final void method2716(boolean var0) {
		class301.method5721();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}
