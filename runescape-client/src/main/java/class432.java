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
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("qg")
public abstract class class432 implements class272 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lsh;"
   )
   class478 field4701;

   class432(int var1) {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;II)V",
      garbageValue = "489961361"
   )
   abstract void vmethod8304(Buffer var1, int var2);

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "-1189317349"
   )
   public void method8303(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         class428[] var3 = new class428[]{class428.field4693, class428.field4692, class428.field4691, class428.field4694};
         class428 var4 = (class428)StructComposition.findEnumerated(var3, var2);
         if (var4 != null) {
            switch (var4.field4695) {
               case 1:
                  int var5 = var1.readUnsignedByte();
                  this.field4701 = class103.method2717(var5);
                  if (this.field4701 != null) {
                     break;
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
               case 2:
                  StructComposition.findEnumerated(Language.method6942(), var1.readUnsignedByte());
                  break;
               case 3:
                  var1.readStringCp1252NullCircumfixed();
                  break;
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
            }
         } else {
            this.vmethod8304(var1, var2);
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-108666621"
   )
   boolean method8305() {
      return this.field4701 != null;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/Object;",
      garbageValue = "1458153897"
   )
   Object method8310() {
      if (this.field4701 == class478.field4948) {
         return 0;
      } else if (this.field4701 == class478.field4947) {
         return -1L;
      } else {
         return this.field4701 == class478.field4946 ? "" : null;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsq;B)V",
      garbageValue = "-106"
   )
   @Export("performReflectionCheck")
   public static void performReflectionCheck(PacketBuffer var0) {
      ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last();
      if (var1 != null) {
         int var2 = var0.offset;
         var0.writeInt(var1.id);

         for(int var3 = 0; var3 < var1.size; ++var3) {
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

                     for(int var8 = 0; var8 < var10.length; ++var8) {
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

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1669272792"
   )
   public static void method8317() {
      HitSplatDefinition.HitSplatDefinition_cached.clear();
      HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
      HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
   }
}
