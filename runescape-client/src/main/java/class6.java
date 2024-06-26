import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public enum class6 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	field19(0, 0);

	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 957914991
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = -251261135
	)
	static int field16;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -262485181
	)
	public final int field17;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1967221797
	)
	final int field18;

	class6(int var3, int var4) {
		this.field17 = var3;
		this.field18 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field18;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lvc;",
		garbageValue = "-16782974"
	)
	public static PrivateChatMode method40(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5501, PrivateChatMode.field5502, PrivateChatMode.field5500};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field5503) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-2126449872"
	)
	public static String method41(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[Lda;",
		garbageValue = "0"
	)
	static class92[] method37() {
		return new class92[]{class92.field1117, class92.field1109, class92.field1116, class92.field1110, class92.field1113, class92.field1112};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "140788292"
	)
	public static int method39(int var0) {
		return class496.field5051[var0 & 16383];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	static void method36() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			VerticalAlignment.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = GrandExchangeOfferOwnWorldComparator.method1234();
			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var4 = Login.Login_username;
				Random var5 = new Random();
				Buffer var6 = new Buffer(128);
				Buffer var7 = new Buffer(128);
				int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
				var6.writeByte(10);

				int var9;
				for (var9 = 0; var9 < 4; ++var9) {
					var6.writeInt(var5.nextInt());
				}

				var6.writeInt(var8[0]);
				var6.writeInt(var8[1]);
				var6.writeLong(var1);
				var6.writeLong(0L);

				for (var9 = 0; var9 < 4; ++var9) {
					var6.writeInt(var5.nextInt());
				}

				var6.encryptRsa(class74.field888, class74.field897);
				var7.writeByte(10);

				for (var9 = 0; var9 < 3; ++var9) {
					var7.writeInt(var5.nextInt());
				}

				var7.writeLong(var5.nextLong());
				var7.writeLongMedium(var5.nextLong());
				SoundSystem.randomDatData2(var7);
				var7.writeLong(var5.nextLong());
				var7.encryptRsa(class74.field888, class74.field897);
				var9 = Actor.stringCp1252NullTerminatedByteSize(var4);
				if (var9 % 8 != 0) {
					var9 += 8 - var9 % 8;
				}

				Buffer var10 = new Buffer(var9);
				var10.writeStringCp1252NullTerminated(var4);
				var10.offset = var9;
				var10.xteaEncryptAll(var8);
				Buffer var11 = new Buffer(var10.offset + var6.offset + var7.offset + 5);
				var11.writeByte(2);
				var11.writeByte(var6.offset);
				var11.writeBytes(var6.array, 0, var6.offset);
				var11.writeByte(var7.offset);
				var11.writeBytes(var7.array, 0, var7.offset);
				var11.writeShort(var10.offset);
				var11.writeBytes(var10.array, 0, var10.offset);
				String var12 = Player.base64Encode(var11.array);

				byte var3;
				try {
					URL var13 = new URL(LoginState.method1248("services", false) + "m=accountappeal/login.ws");
					URLConnection var14 = var13.openConnection();
					var14.setDoInput(true);
					var14.setDoOutput(true);
					var14.setConnectTimeout(5000);
					OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
					var15.write("data2=" + DbTableType.method9449(var12) + "&dest=" + DbTableType.method9449("passwordchoice.ws"));
					var15.flush();
					InputStream var16 = var14.getInputStream();
					var11 = new Buffer(new byte[1000]);

					while (true) {
						int var17 = var16.read(var11.array, var11.offset, 1000 - var11.offset);
						if (var17 == -1) {
							var15.close();
							var16.close();
							String var20 = new String(var11.array);
							if (var20.startsWith("OFFLINE")) {
								var3 = 4;
							} else if (var20.startsWith("WRONG")) {
								var3 = 7;
							} else if (var20.startsWith("RELOAD")) {
								var3 = 3;
							} else if (var20.startsWith("Not permitted for social network accounts.")) {
								var3 = 6;
							} else {
								var11.xteaDecryptAll(var8);

								while (var11.offset > 0 && var11.array[var11.offset - 1] == 0) {
									--var11.offset;
								}

								var20 = new String(var11.array, 0, var11.offset);
								boolean var18;
								if (var20 == null) {
									var18 = false;
								} else {
									label103: {
										try {
											new URL(var20);
										} catch (MalformedURLException var21) {
											var18 = false;
											break label103;
										}

										var18 = true;
									}
								}

								if (var18) {
									class421.openURL(var20, true, false);
									var3 = 2;
								} else {
									var3 = 5;
								}
							}
							break;
						}

						var11.offset += var17;
						if (var11.offset >= 1000) {
							var3 = 5;
							break;
						}
					}
				} catch (Throwable var22) {
					var22.printStackTrace();
					var3 = 5;
				}

				var0 = var3;
			}

			switch(var0) {
			case 2:
				VerticalAlignment.setLoginResponseString(Strings.field4293, Strings.field4161, Strings.field4384);
				class163.updateLoginIndex(6);
				break;
			case 3:
				VerticalAlignment.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				VerticalAlignment.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				VerticalAlignment.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				VerticalAlignment.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				VerticalAlignment.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1930833559"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class76.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = class164.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					InterfaceParent.foundItemIdCount = -1;
					WorldMapLabelSize.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		WorldMapLabelSize.foundItemIds = var2;
		MenuAction.foundItemIndex = 0;
		InterfaceParent.foundItemIdCount = var3;
		String[] var8 = new String[InterfaceParent.foundItemIdCount];

		for (int var5 = 0; var5 < InterfaceParent.foundItemIdCount; ++var5) {
			var8[var5] = class164.ItemDefinition_get(var2[var5]).name;
		}

		class175.method3558(var8, WorldMapLabelSize.foundItemIds);
	}
}
