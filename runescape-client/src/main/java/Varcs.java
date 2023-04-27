import java.io.EOFException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ep")
@Implements("Varcs")
public class Varcs {
   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      descriptor = "Lqw;"
   )
   @Export("spriteIds")
   static GraphicsDefaults spriteIds;
   @ObfuscatedName("aw")
   @Export("intsPersistence")
   boolean[] intsPersistence;
   @ObfuscatedName("ac")
   @Export("map")
   Map map;
   /** @deprecated */
   @Deprecated
   @ObfuscatedName("au")
   @Export("strings")
   String[] strings;
   @ObfuscatedName("ab")
   @Export("unwrittenChanges")
   boolean unwrittenChanges = false;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      longValue = -7171747788514623875L
   )
   long field1371;

   Varcs() {
      int var1 = class85.archive2.getGroupFileCount(19);
      this.map = new HashMap();
      this.intsPersistence = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2);
         VarcInt var3;
         if (var4 != null) {
            var3 = var4;
         } else {
            byte[] var5 = class294.VarcInt_archive.takeFile(19, var2);
            var4 = new VarcInt();
            if (var5 != null) {
               var4.method3680(new Buffer(var5));
            }

            VarcInt.VarcInt_cached.put(var4, (long)var2);
            var3 = var4;
         }

         this.intsPersistence[var2] = var3.persist;
      }

      var2 = 0;
      if (class85.archive2.method6646(15)) {
         var2 = class85.archive2.getGroupFileCount(15);
      }

      this.strings = new String[var2];
      this.read();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1427050414"
   )
   @Export("setInt")
   void setInt(int var1, int var2) {
      this.map.put(var1, var2);
      if (this.intsPersistence[var1]) {
         this.unwrittenChanges = true;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "721184906"
   )
   @Export("getInt")
   int getInt(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "-875468987"
   )
   @Export("setString")
   void setString(int var1, String var2) {
      this.map.put(var1, var2);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-1231946680"
   )
   @Export("getString")
   String getString(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   /** @deprecated */
   @Deprecated
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "-1623165865"
   )
   @Export("setStringOld")
   void setStringOld(int var1, String var2) {
      this.strings[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "8"
   )
   @Export("getStringOld")
   String getStringOld(int var1) {
      return this.strings[var1];
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-39979061"
   )
   @Export("clearTransient")
   void clearTransient() {
      int var1;
      for(var1 = 0; var1 < this.intsPersistence.length; ++var1) {
         if (!this.intsPersistence[var1]) {
            this.map.remove(var1);
         }
      }

      for(var1 = 0; var1 < this.strings.length; ++var1) {
         this.strings[var1] = null;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ZB)Lsy;",
      garbageValue = "61"
   )
   @Export("getPreferencesFile")
   AccessFile getPreferencesFile(boolean var1) {
      return Rasterizer3D.getPreferencesFile("2", Client.field490.name, var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1900216587"
   )
   @Export("write")
   void write() {
      AccessFile var1 = this.getPreferencesFile(true);

      try {
         int var2 = 3;
         int var3 = 0;
         Iterator var4 = this.map.entrySet().iterator();

         while(var4.hasNext()) {
            Map.Entry var5 = (Map.Entry)var4.next();
            int var6 = (Integer)var5.getKey();
            if (this.intsPersistence[var6]) {
               Object var7 = var5.getValue();
               var2 += 3;
               if (var7 instanceof Integer) {
                  var2 += 4;
               } else if (var7 instanceof String) {
                  var2 += DynamicObject.stringCp1252NullTerminatedByteSize((String)var7);
               }

               ++var3;
            }
         }

         Buffer var23 = new Buffer(var2);
         var23.writeByte(2);
         var23.writeShort(var3);
         Iterator var24 = this.map.entrySet().iterator();

         while(var24.hasNext()) {
            Map.Entry var12 = (Map.Entry)var24.next();
            int var13 = (Integer)var12.getKey();
            if (this.intsPersistence[var13]) {
               var23.writeShort(var13);
               Object var8 = var12.getValue();
               class478 var9 = class478.method8888(var8.getClass());
               var23.writeByte(var9.field4950);
               class478.method8906(var8, var23);
            }
         }

         var1.write(var23.array, 0, var23.offset);
      } catch (Exception var21) {
      } finally {
         try {
            var1.close();
         } catch (Exception var20) {
         }

      }

      this.unwrittenChanges = false;
      this.field1371 = class96.method2634();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-44"
   )
   @Export("read")
   void read() {
      AccessFile var1 = this.getPreferencesFile(false);

      label229: {
         try {
            byte[] var2 = new byte[(int)var1.length()];

            int var4;
            for(int var3 = 0; var3 < var2.length; var3 += var4) {
               var4 = var1.read(var2, var3, var2.length - var3);
               if (var4 == -1) {
                  throw new EOFException();
               }
            }

            Buffer var14 = new Buffer(var2);
            if (var14.array.length - var14.offset < 1) {
               return;
            }

            int var15 = var14.readUnsignedByte();
            if (var15 >= 0 && var15 <= 2) {
               int var7;
               int var8;
               int var9;
               int var16;
               if (var15 >= 2) {
                  var16 = var14.readUnsignedShort();
                  var7 = 0;

                  while(true) {
                     if (var7 >= var16) {
                        break label229;
                     }

                     var8 = var14.readUnsignedShort();
                     var9 = var14.readUnsignedByte();
                     class478 var10 = (class478)StructComposition.findEnumerated(class478.method8889(), var9);
                     Object var11 = var10.method8895(var14);
                     if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
                        this.map.put(var8, var11);
                     }

                     ++var7;
                  }
               } else {
                  var16 = var14.readUnsignedShort();

                  for(var7 = 0; var7 < var16; ++var7) {
                     var8 = var14.readUnsignedShort();
                     var9 = var14.readInt();
                     if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
                        this.map.put(var8, var9);
                     }
                  }

                  var7 = var14.readUnsignedShort();
                  var8 = 0;

                  while(true) {
                     if (var8 >= var7) {
                        break label229;
                     }

                     var14.readUnsignedShort();
                     var14.readStringCp1252NullTerminated();
                     ++var8;
                  }
               }
            }
         } catch (Exception var25) {
            break label229;
         } finally {
            try {
               var1.close();
            } catch (Exception var24) {
            }

         }

         return;
      }

      this.unwrittenChanges = false;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2118979895"
   )
   @Export("tryWrite")
   void tryWrite() {
      if (this.unwrittenChanges && this.field1371 < class96.method2634() - 60000L) {
         this.write();
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1302793492"
   )
   @Export("hasUnwrittenChanges")
   boolean hasUnwrittenChanges() {
      return this.unwrittenChanges;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)[Llm;",
      garbageValue = "-49"
   )
   public static class287[] method2720() {
      return new class287[]{class287.field3206, class287.field3197, class287.field3201, class287.field3199, class287.field3200, class287.field3202, class287.field3208, class287.field3203, class287.field3204, class287.field3205, class287.field3196};
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "2095977299"
   )
   static int method2755(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      } else {
         var3 = var2 ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
      }

      class144.invalidateWidget(var3);
      int var4;
      int var5;
      if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
         if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
            var3.modelType = 2;
            var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
            var3.modelType = 3;
            var3.modelId = MusicPatchNode.localPlayer.appearance.getChatHeadId();
            return 1;
         } else if (var0 == 1207) {
            boolean var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
            SecureRandomCallable.method2223(var3, MusicPatchNode.localPlayer.appearance, var7);
            return 1;
         } else if (var0 == 1208) {
            var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var3.field3584 == null) {
               throw new RuntimeException("");
            } else {
               class282.method5683(var3, var4);
               return 1;
            }
         } else if (var0 == 1209) {
            Interpreter.Interpreter_intStackSize -= 2;
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            if (var3.field3584 == null) {
               throw new RuntimeException("");
            } else {
               ChatChannel.method2156(var3, var4, var5);
               return 1;
            }
         } else if (var0 == 1210) {
            var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var3.field3584 == null) {
               throw new RuntimeException("");
            } else {
               class162.method3452(var3, MusicPatchNode.localPlayer.appearance.gender, var4);
               return 1;
            }
         } else {
            return 2;
         }
      } else {
         Interpreter.Interpreter_intStackSize -= 2;
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var3.itemId = var4;
         var3.itemQuantity = var5;
         ItemComposition var6 = HealthBarUpdate.ItemDefinition_get(var4);
         var3.modelAngleX = var6.xan2d;
         var3.modelAngleY = var6.yan2d;
         var3.modelAngleZ = var6.zan2d;
         var3.modelOffsetX = var6.offsetX2d;
         var3.modelOffsetY = var6.offsetY2d;
         var3.modelZoom = var6.zoom2d;
         if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
            var3.itemQuantityMode = 0;
         } else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
            var3.itemQuantityMode = 1;
         } else {
            var3.itemQuantityMode = 2;
         }

         if (var3.field3625 > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.field3625;
         } else if (var3.rawWidth > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
         }

         return 1;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/Date;",
      garbageValue = "2052817619"
   )
   static Date method2747() {
      java.util.Calendar var0 = java.util.Calendar.getInstance();
      var0.set(2, 0);
      var0.set(5, 1);
      var0.set(1, 1900);
      return var0.getTime();
   }
}
