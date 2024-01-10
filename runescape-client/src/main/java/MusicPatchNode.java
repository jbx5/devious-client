import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("mv")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field3548;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1904391139
	)
	int field3557;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	MusicPatchNode2 field3545;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1453854541
	)
	int field3553;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -498307473
	)
	int field3568;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1106342015
	)
	int field3551;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1299660053
	)
	int field3552;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -333556033
	)
	int field3549;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 167889727
	)
	int field3567;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -180870853
	)
	int field3550;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1877852160
	)
	int field3556;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -195124119
	)
	int field3566;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1100860522
	)
	int field3558;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1426969919
	)
	int field3559;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1250059833
	)
	int field3560;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -958429645
	)
	int field3561;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1476946873
	)
	int field3562;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 729467977
	)
	int field3564;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -425741649
	)
	int field3554;

	MusicPatchNode() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	void method6288() {
		this.table = null;
		this.rawSound = null;
		this.field3545 = null;
		this.stream = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luo;B)V",
		garbageValue = "25"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last();
		if (var1 != null) {
			int var2 = var0.offset;
			var0.writeInt(var1.id);

			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) {
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.fields[var3];
							var6 = Reflection.getInt(var5, (Object)null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3];
							byte[][] var10 = var1.arguments[var3];
							Object[] var7 = new Object[var10.length];

							for (int var8 = 0; var8 < var10.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject();
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number)var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated((String)var11);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) {
						var0.writeByte(-18);
					} catch (NullPointerException var22) {
						var0.writeByte(-19);
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}

			var0.writeCrc(var2);
			var1.remove();
		}
	}
}
