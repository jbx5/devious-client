import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.DataInputStream;
import net.runelite.mapping.Export;
@ObfuscatedName("mr")
public class class359 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", garbageValue = "-891701215")
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = Players.method2497(var1);
				}
				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}
					var2 = var2 + var0;
				}
				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}
				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + class138.field1608 + "&u=" + class392.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class133.clientType + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}
		}
	}
}