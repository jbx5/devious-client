import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("fm")
@Implements("ClanChannel")
public class ClanChannel extends Node {
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Ldg;"
   )
   @Export("World_request")
   static UrlRequest World_request;
   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      descriptor = "[Lrs;"
   )
   @Export("headIconPkSprites")
   static SpritePixels[] headIconPkSprites;
   @ObfuscatedName("f")
   boolean field1789;
   @ObfuscatedName("w")
   boolean field1790 = true;
   @ObfuscatedName("v")
   @Export("members")
   public List members;
   @ObfuscatedName("s")
   @Export("sortedMembers")
   int[] sortedMembers;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = 5364181956474599071L
   )
   long field1792;
   @ObfuscatedName("j")
   @Export("name")
   public String name = null;
   @ObfuscatedName("i")
   public byte field1794;
   @ObfuscatedName("n")
   public byte field1795;

   static {
      new BitSet(65536);
   }

   @ObfuscatedSignature(
      descriptor = "(Lrd;)V"
   )
   public ClanChannel(Buffer var1) {
      this.method3358(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "1723200754"
   )
   @Export("getSortedMembers")
   public int[] getSortedMembers() {
      if (this.sortedMembers == null) {
         String[] var1 = new String[this.members.size()];
         this.sortedMembers = new int[this.members.size()];

         for(int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
            var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9270();
         }

         int[] var3 = this.sortedMembers;
         GameObject.method4867(var1, var3, 0, var1.length - 1);
      }

      return this.sortedMembers;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leu;I)V",
      garbageValue = "-758878496"
   )
   @Export("addMember")
   void addMember(ClanChannelMember var1) {
      this.members.add(var1);
      this.sortedMembers = null;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "555394235"
   )
   @Export("removeMember")
   void removeMember(int var1) {
      this.members.remove(var1);
      this.sortedMembers = null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1410246446"
   )
   public int method3359() {
      return this.members.size();
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-1403435535"
   )
   public int method3357(String var1) {
      if (!this.field1790) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.members.size(); ++var2) {
            if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "188484319"
   )
   void method3358(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if ((var2 & 1) != 0) {
         this.field1789 = true;
      }

      if ((var2 & 2) != 0) {
         this.field1790 = true;
      }

      int var3 = 2;
      if ((var2 & 4) != 0) {
         var3 = var1.readUnsignedByte();
      }

      super.key = var1.readLong();
      this.field1792 = var1.readLong();
      this.name = var1.readStringCp1252NullTerminated();
      var1.readBoolean();
      this.field1795 = var1.readByte();
      this.field1794 = var1.readByte();
      int var4 = var1.readUnsignedShort();
      if (var4 > 0) {
         this.members = new ArrayList(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            ClanChannelMember var6 = new ClanChannelMember();
            if (this.field1789) {
               var1.readLong();
            }

            if (this.field1790) {
               var6.username = new Username(var1.readStringCp1252NullTerminated());
            }

            var6.rank = var1.readByte();
            var6.world = var1.readUnsignedShort();
            if (var3 >= 3) {
               var1.readBoolean();
            }

            this.members.add(var5, var6);
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lru;I)V",
      garbageValue = "-573182363"
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

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "249976305"
   )
   public static int method3366(int var0) {
      return var0 >> 17 & 7;
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "25"
   )
   @Export("selectSpell")
   static void selectSpell(int var0, int var1, int var2, int var3) {
      Widget var4 = class135.getWidgetChild(var0, var1);
      if (var4 != null && var4.onTargetEnter != null) {
         ScriptEvent var5 = new ScriptEvent();
         var5.widget = var4;
         var5.args = var4.onTargetEnter;
         WorldMapAreaData.runScriptEvent(var5);
      }

      Client.selectedSpellItemId = var3;
      Client.isSpellSelected = true;
      class9.selectedSpellWidget = var0;
      Client.selectedSpellChildIndex = var1;
      class149.selectedSpellFlags = var2;
      LoginScreenAnimation.invalidateWidget(var4);
   }
}
