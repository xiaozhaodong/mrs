package com.newland.mrs.impl.config.rule.listener;

import com.newland.mrs.persist.model.MrsRuleResult;
import org.kie.api.definition.rule.Rule;
import org.kie.api.event.rule.*;
import org.kie.api.runtime.rule.Match;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * HitRuleListener
 * 命中规则监听
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-28 16:36
 **/
public class HitRuleListener implements AgendaEventListener {

    private final List<Rule> hitRules = new ArrayList<>();

    @Override
    public void matchCreated(MatchCreatedEvent matchCreatedEvent) {

    }

    @Override
    public void matchCancelled(MatchCancelledEvent matchCancelledEvent) {

    }

    @Override
    public void beforeMatchFired(BeforeMatchFiredEvent beforeMatchFiredEvent) {

    }

    @Override
    public void afterMatchFired(AfterMatchFiredEvent afterMatchFiredEvent) {
        Match match = afterMatchFiredEvent.getMatch();
        Rule rule = match.getRule();
        hitRules.add(rule);
    }

    public List<Rule> getHitRules() {
        return hitRules;
    }

    @Override
    public void agendaGroupPopped(AgendaGroupPoppedEvent agendaGroupPoppedEvent) {

    }

    @Override
    public void agendaGroupPushed(AgendaGroupPushedEvent agendaGroupPushedEvent) {

    }

    @Override
    public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent ruleFlowGroupActivatedEvent) {

    }

    @Override
    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent ruleFlowGroupActivatedEvent) {

    }

    @Override
    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent ruleFlowGroupDeactivatedEvent) {

    }

    @Override
    public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent ruleFlowGroupDeactivatedEvent) {

    }
}
