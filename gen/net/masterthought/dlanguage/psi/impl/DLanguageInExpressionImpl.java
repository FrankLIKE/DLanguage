// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageInExpressionImpl extends ASTWrapperPsiElement implements DLanguageInExpression {

  public DLanguageInExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitInExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DLanguageShiftExpression> getShiftExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLanguageShiftExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getIn() {
    return findNotNullChildByType(IN);
  }

  @Override
  @Nullable
  public PsiElement getNot() {
    return findChildByType(NOT);
  }

}
