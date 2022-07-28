package org.json;

import net.runelite.mapping.Implements;

@Implements("Null")
final class Null {
   // $FF: synthetic method
   Null(JSONObject var1) {
      this();
   }

   Null() {
   }

   public final Object clone() {
      return this;
   }

   public boolean equals(Object var1) {
      return var1 == null || this == var1;
   }

   public String toString() {
      return "null";
   }
}
