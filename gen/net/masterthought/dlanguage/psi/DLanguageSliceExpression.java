// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageSliceExpression extends PsiElement {

  @NotNull
  List<DLanguageAssignExpression> getAssignExpressionList();

  @NotNull
  DLanguageUnaryExpression getUnaryExpression();

  @NotNull
  PsiElement getLBracket();

  @NotNull
  PsiElement getRBracket();

  @Nullable
  PsiElement getSlice();

}
