import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ip")
public class class216 {
	@ObfuscatedName("aj")
	@Export("osName")
	static String osName;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	class225 field2362;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	class227 field2364;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1183429397
	)
	int field2360;
	@ObfuscatedName("ah")
	String field2361;
	@ObfuscatedName("ap")
	String field2353;
	@ObfuscatedName("ab")
	String field2363;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	UrlRequest field2358;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1632102609
	)
	int field2365;

	public class216() {
		this.field2360 = -1;
		this.field2365 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lib;",
		garbageValue = "-699872601"
	)
	public class225 method4396() {
		return this.field2362;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Len;I)Z",
		garbageValue = "-1911499294"
	)
	public boolean method4397(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4395();

				try {
					this.field2361 = var1;
					this.field2358 = var3.request(new URL(this.field2361));
					this.field2360 = 0;
				} catch (MalformedURLException var5) {
					this.method4395();
					this.field2360 = 4;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2363 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "65"
	)
	public void method4398(String var1, String var2, String var3) {
		this.field2362 = Player.method2610();
		this.field2353 = var1;
		this.field2362.method4519(this.field2353, var2, var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Len;B)V",
		garbageValue = "-100"
	)
	public void method4431(UrlRequester var1) {
		switch(this.field2360) {
		case 0:
			this.method4411(var1);
			break;
		case 1:
			this.method4412();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-644911800"
	)
	public int method4402() {
		return this.field2360;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "69"
	)
	public boolean method4426() {
		return this.field2364 != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1848548635"
	)
	public int method4430(String var1) {
		return this.field2364.field2445.containsKey(var1) ? (Integer)this.field2364.field2445.get(var1) : -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "47"
	)
	public String method4403(String var1) {
		return (String)((String)(this.field2364.field2446.containsKey(var1) ? this.field2364.field2446.get(var1) : null));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "2051625141"
	)
	public ArrayList method4404() {
		return this.field2364.field2443;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "2"
	)
	public ArrayList method4405() {
		return this.field2364.field2442;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1606471582"
	)
	public ArrayList method4406() {
		return this.field2364.field2440;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-38"
	)
	public String method4399() {
		return this.field2364.field2437;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "36"
	)
	public float[] method4408() {
		return this.field2364.field2444;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1962957927"
	)
	public String method4407() {
		return this.field2364.method4568();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1454679332"
	)
	void method4395() {
		this.field2358 = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "711271764"
	)
	void method4411(UrlRequester var1) {
		if (this.field2358 != null && this.field2358.isDone()) {
			byte[] var2 = this.field2358.getResponse();
			if (var2 == null) {
				this.method4395();
				this.field2360 = 4;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2365 = var4.getInt("version");
					} catch (Exception var6) {
						this.method4395();
						this.field2360 = 6;
						return;
					}

					if (this.field2365 < 2) {
						if (!this.field2364.method4556(var4, this.field2365, var1)) {
							this.field2360 = 6;
						}
					} else if (this.field2365 == 2) {
						class229 var5 = class227.method4553();
						var5.method4596(var4, this.field2365, var1);
						this.field2364 = var5.method4599(this.field2363);
						if (this.field2364 != null) {
							this.method4412();
							this.field2360 = 1;
						} else {
							this.field2360 = 7;
						}
					}
				} catch (UnsupportedEncodingException var7) {
					this.method4395();
					this.field2360 = 6;
					return;
				}

				if (this.field2364 != null) {
					this.field2360 = this.field2364.field2443.size() > 0 ? 1 : 2;
				}

				this.field2358 = null;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
	)
	void method4412() {
		Iterator var1 = this.field2364.field2443.iterator();

		class217 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2364.field2443.iterator();

				while (var1.hasNext()) {
					var2 = (class217)var1.next();
					if (var2.field2369 != null) {
						byte[] var3 = var2.field2369.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2360 = 2;
							return;
						}
					}
				}

				this.method4395();
				this.field2360 = 5;
				return;
			}

			var2 = (class217)var1.next();
		} while(var2.field2369 == null || var2.field2369.isDone());

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Len;B)Z",
		garbageValue = "-24"
	)
	public boolean method4413(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2365 = var3.getInt("version");
			} catch (Exception var5) {
				this.method4395();
				this.field2360 = 6;
				return false;
			}

			if (!this.field2364.method4556(var3, this.field2365, var2)) {
				this.field2360 = 6;
			}

			this.field2360 = this.field2364.field2443.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var6) {
			this.field2360 = 6;
		}

		return this.field2360 < 3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lcr;Lcr;IZIZB)I",
		garbageValue = "-1"
	)
	static int method4415(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class227.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = class227.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "1312792627"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		int var5 = var0 >>> 16;
		int var6 = var0 & 65535;
		Widget var7 = TaskHandler.widgetDefinition.getWidgetChild(var1, var2);
		if (var7 != null) {
			if (var7.onOp != null) {
				ScriptEvent var8 = new ScriptEvent();
				var8.widget = var7;
				var8.opIndex = var6;
				var8.field1103 = var5;
				var8.targetName = var4;
				var8.args = var7.onOp;
				class215.runScriptEvent(var8);
			}

			boolean var13 = true;
			if (var7.contentType > 0) {
				var13 = class137.method3343(var7);
			}

			if (var13) {
				int var10 = class310.getWidgetFlags(var7);
				int var11 = var6 - 1;
				boolean var9 = (var10 >> var11 + 1 & 1) != 0;
				if (var9) {
					PacketBufferNode var12;
					if (var0 == 1) {
						var12 = class141.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 2) {
						var12 = class141.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 3) {
						var12 = class141.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 4) {
						var12 = class141.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 5) {
						var12 = class141.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 6) {
						var12 = class141.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 7) {
						var12 = class141.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 8) {
						var12 = class141.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 9) {
						var12 = class141.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 10) {
						var12 = class141.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var5 != 0) {
						var12 = class141.getPacketBufferNode(ClientPacket.IF_SUBOP, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						var12.packetBuffer.writeByte(var6);
						var12.packetBuffer.writeByte(var5 - 1);
						Client.packetWriter.addNode(var12);
					}

				}
			}
		}
	}
}
