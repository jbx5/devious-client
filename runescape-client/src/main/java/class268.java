import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.TimeZone;



import net.runelite.rs.Reflection; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public final class class268 {
	@ObfuscatedName("h")
	static final HashMap field3146;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("ir")
	@ObfuscatedSignature(descriptor = 
	"[Lqx;")

	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	static 
	{
		field3146 = new HashMap();
		TimeZone var0;
		synchronized(field3146) {
			TimeZone var2 = ((TimeZone) (field3146.get("Europe/London")));
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3146.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llq;I)V", garbageValue = 
	"2063025013")

	public static void method5226(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)Lfh;", garbageValue = 
	"-1220321256")

	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = ((EnumComposition) (EnumComposition.EnumDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = JagexCache.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;II)V", garbageValue = 
	"628991025")

	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (((var4 != 0) && (var4 != 1)) && (var4 != 2)) {
					if ((var4 == 3) || (var4 == 4)) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = class359.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class359.loadClassFromDescriptor(var20);
						if (class359.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = class359.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var21.length == var17.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var21[var19] != var17[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && (var22 == var16.getReturnType())) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (class359.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class359.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class33.reflectionChecks.addFirst(var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"1384641723")

	static void method5232(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = ((ObjectSound) (ObjectSound.objectSounds.last())); var4 != null; var4 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if ((var4.soundEffectId != (-1)) || (var4.soundEffectIds != null)) {
				int var5 = 0;
				if (var1 > var4.maxX) {
					var5 += var1 - var4.maxX;
				} else if (var1 < var4.x) {
					var5 += var4.x - var1;
				}

				if (var2 > var4.maxY) {
					var5 += var2 - var4.maxY;
				} else if (var2 < var4.y) {
					var5 += var4.y - var2;
				}

				if ((((var5 - 64) <= var4.field813) && (Interpreter.clientPreferences.method2286() != 0)) && (var0 == var4.plane)) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var6 = ((var4.field813 - var5) * Interpreter.clientPreferences.method2286()) / var4.field813;
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(MouseHandler.archive4, var4.soundEffectId, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(LoginScreenAnimation.decimator);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								WorldMapIcon_1.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method818(var6);
					}

					if (var4.stream2 == null) {
						if ((var4.soundEffectIds != null) && ((var4.field821 -= var3) <= 0)) {
							int var11 = ((int) (Math.random() * ((double) (var4.soundEffectIds.length))));
							SoundEffect var12 = SoundEffect.readSoundEffect(MouseHandler.archive4, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(LoginScreenAnimation.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								WorldMapIcon_1.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field821 = var4.field809 + ((int) (Math.random() * ((double) (var4.field819 - var4.field809))));
							}
						}
					} else {
						var4.stream2.method818(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						WorldMapIcon_1.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						WorldMapIcon_1.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"-597064413")

	public static boolean method5227(int var0) {
		return (var0 >= 0) && (var0 < 112) ? KeyHandler.field121[var0] : false;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;IIII)V", garbageValue = 
	"1150273936")

	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3424 == null) {
			throw new RuntimeException();
		} else {
			var0.field3424[var1] = var2;
			var0.field3425[var1] = var3;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-112")

	static void method5228() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}