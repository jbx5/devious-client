import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("dz")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lex;")
	static ClanChannel field1386;

	@ObfuscatedName("ci")
	@ObfuscatedSignature(descriptor = "Lqu;")
	static IndexedSprite field1385;

	@ObfuscatedName("gx")
	static String field1387;

	@ObfuscatedName("pb")
	@ObfuscatedGetter(intValue = 1731263595)
	static int field1389;

	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnm;Lnm;B)I", garbageValue = "-4")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}
		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Lpe;I)Ljava/lang/String;", garbageValue = "-1070606136")
	public static String method2580(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;
			int var3;
			for (var3 = var0.length(); var2 < var3 && class154.method3163(var0.charAt(var2)); ++var2) {
			}
			while (var3 > var2 && class154.method3163(var0.charAt(var3 - 1))) {
				--var3;
			} 
			int var4 = var3 - var2;
			if (var4 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch (var1.field4618) {
						case 4 :
							var6 = 20;
							break;
						default :
							var6 = 12;
					}
				}
				if (var4 <= var6) {
					StringBuilder var12 = new StringBuilder(var4);
					for (int var14 = var2; var14 < var3; ++var14) {
						char var7 = var0.charAt(var14);
						boolean var8;
						if (Character.isISOControl(var7)) {
							var8 = false;
						} else if (FloorOverlayDefinition.isAlphaNumeric(var7)) {
							var8 = true;
						} else {
							char[] var9 = class423.field4622;
							int var10 = 0;
							label84 : while (true) {
								char var11;
								if (var10 >= var9.length) {
									var9 = class423.field4625;
									for (var10 = 0; var10 < var9.length; ++var10) {
										var11 = var9[var10];
										if (var11 == var7) {
											var8 = true;
											break label84;
										}
									}
									var8 = false;
									break;
								}
								var11 = var9[var10];
								if (var7 == var11) {
									var8 = true;
									break;
								}
								++var10;
							} 
						}
						if (var8) {
							char var13 = PacketBufferNode.method5203(var7);
							if (var13 != 0) {
								var12.append(var13);
							}
						}
					}
					if (var12.length() == 0) {
						return null;
					}
					return var12.toString();
				}
			}
			return null;
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "24")
	static final void method2586() {
		Client.field525 = Client.cycleCntr;
		class326.field4082 = true;
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "7108")
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = EnumComposition.getPacketBufferNode(ClientPacket.CLAN_LEAVECHAT, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}